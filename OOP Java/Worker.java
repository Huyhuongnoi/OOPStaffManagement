public class Worker extends Officer {
    public int rank;
    public Worker(String name, int age, String sex, String address, int rank){
        super(name, age, sex, address);
        this.rank = rank;
    }
    public String dataCongNhan(){
        String data = this.name + "\n" + String.valueOf(this.age) + "\n" + this.sex + "\n" + this.address + "\n" + String.valueOf(this.rank);
        return data;
    }
    public String getName(){
        return this.name;
    }
}