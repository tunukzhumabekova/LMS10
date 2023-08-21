package Enum.LMS10;

public enum Days {
    Monday{
        @Override
        public void method() {
            super.method();
            System.out.println("Дуйшомбу куну жава окуйм");
        }
    },
    Tuesday{
        @Override
        public void method() {
            super.method();
            System.out.println("Шейшемби куну ангдис тил сабагын окуйм");
        }
    },
    Wednesday{
        @Override
        public void method() {
            super.method();
            System.out.println("Шаршемби куну жава окуйм");
        }
    },
    Thursday{
        @Override
        public void method() {
            super.method();
            System.out.println("Бейшемби куну Soft Skills окуйм");
        }
    },
    Friday{
        @Override
        public void method() {
            super.method();
            System.out.println("Жума куну анлис тилин окуйм");
        }
    },
    Saturday{
        @Override
        public void method() {
            super.method();
            System.out.println("Ишемби куну практика кылам");
        }
    },
    Sunday{
        @Override
        public void method() {
            super.method();
            System.out.println("Жекшемби куну эс алам");
        }
    };
    public  void method(){}
}
