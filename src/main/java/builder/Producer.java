package builder;

/**
 * Created by bobby on 25.04.2016.
 */

public class Producer {

    private String name;
    private int age;
    private String feature;

    public Producer(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.feature = builder.feature;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", feature='" + feature + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Producer producer = new Builder("Mike")
                .hasAge(10)
                .hasFeature("fast")
                .build();
        System.out.println(producer);
    }


    public static class Builder {

        private String name;
        private int age;
        private String feature;

        public Builder(String name) {
            this.name = name;
        }

        public Builder hasAge(int age) {
            this.age = age;
            return this;
        }

        public Builder hasFeature(String feature) {
            this.feature = feature;
            return this;
        }

        public Producer build() {
            return new Producer(this);
        }
    }


}
