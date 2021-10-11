public class FloatTypeData extends SpecificTypeData<Float> {
    public FloatTypeData(float f1) {
        super(f1);
    }

    @Override
    public void addData(Float f2) {
        data+=f2;
    }
}
