public class IntTypeData extends SpecificTypeData<Integer> {
    public IntTypeData(int n1) {
        super(n1);
    }

    @Override
    public void addData(Integer n2) {
        data += n2;
    }
}
