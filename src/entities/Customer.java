package entities;

public class Customer {

        private long id;

        private String name;

        private int tier;

        public Customer(long id, String name, int tier) {
            this.id = id;
            this.name = name;
            this.tier = tier;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTier() {
            return tier;
        }

        public void setTier(int tier) {
            this.tier = tier;
        }
    }

