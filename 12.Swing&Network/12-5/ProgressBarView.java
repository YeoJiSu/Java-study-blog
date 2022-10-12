import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class ProgressBarView extends JPanel implements ActionListener, PropertyChangeListener {

    private JProgressBar progress;
    private JTextArea text;
    private JButton button;
    private Task task;

    public ProgressBarView(){
        progress = new JProgressBar(0,100);
        progress.setValue(0);
        progress.setStringPainted(true);

        button = new JButton("Start");
        button.setActionCommand("Start");
        button.addActionListener(this);

        text = new JTextArea(5,20);
        text.setMargin(new Insets(6,6,6,6));
        text.setEditable(false);

        JPanel panel= new JPanel();
        panel.add(button);
        panel.add(progress);

        add(panel, BorderLayout.PAGE_START);
        add(new JScrollPane(text), BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent event){
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        button.setEnabled(false);
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }
    public void propertyChange(PropertyChangeEvent event){
        if ("progress" == event.getPropertyName()) {
            int value = (Integer) event.getNewValue();
            progress.setValue(value);
            text.append(String.format("Completed %d%% of task.\n",task.getProgress()));
            if (value == 100){
                button.setEnabled(true);
                setCursor(null);
                text.append("Done!\n");
            }
        }
    }
}
