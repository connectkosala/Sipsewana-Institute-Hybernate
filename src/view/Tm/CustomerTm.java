package view.admin.Tm.User;

public class CustomerTm {

    public class CustomerTm {
        private String id;
        private String title;
        private String name;
        private String address;
        private String city;
        private String province;
        private String postalcode;

        public CustomerTm(String id, String title, String name, String address, String city, String province, String postalcode) {
            this.id = id;
            this.title = title;
            this.name = name;
            this.address = address;
            this.city = city;
            this.province = province;
            this.postalcode = postalcode;
        }

        public CustomerTm() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getPostalcode() {
            return postalcode;
        }

        public void setPostalcode(String postalcode) {
            this.postalcode = postalcode;
        }

        @Override
        public String toString() {
            return "CustomerTm{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", province='" + province + '\'' +
                    ", postalcode='" + postalcode + '\'' +
                    '}';
        }
    }

}
