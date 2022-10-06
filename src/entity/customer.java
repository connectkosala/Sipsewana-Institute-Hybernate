package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class customer {

    @Entity
    public class customer {
        @Id
        private String CustId;
        private String CustTitle;
        private String CustName;
        private String Custaddress;
        private String City;
        private String Province;
        private String Postalcode;

        @OneToMany(mappedBy = "orders")
        private List<orders> orders = new ArrayList<>();

        @ManyToOne
        private user user;

        public customer(String custId) {
            CustId = custId;
        }

        public customer(String custId, String custTitle, String custName, String custaddress, String city, String province, String postalcode, List<orders> orders, entity.user user) {
            CustId = custId;
            CustTitle = custTitle;
            CustName = custName;
            Custaddress = custaddress;
            City = city;
            Province = province;
            Postalcode = postalcode;
            this.orders = orders;
            this.user = user;
        }

        public String getCustId() {
            return CustId;
        }

        public void setCustId(String custId) {
            CustId = custId;
        }

        public String getCustTitle() {
            return CustTitle;
        }

        public void setCustTitle(String custTitle) {
            CustTitle = custTitle;
        }

        public String getCustName() {
            return CustName;
        }

        public void setCustName(String custName) {
            CustName = custName;
        }

        public String getCustaddress() {
            return Custaddress;
        }

        public void setCustaddress(String custaddress) {
            Custaddress = custaddress;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public String getProvince() {
            return Province;
        }

        public void setProvince(String province) {
            Province = province;
        }

        public String getPostalcode() {
            return Postalcode;
        }

        public void setPostalcode(String postalcode) {
            Postalcode = postalcode;
        }

        public List<orders> getOrders() {
            return orders;
        }

        public void setOrders(List<orders> orders) {
            this.orders = orders;
        }

        public entity.user getUser() {
            return user;
        }

        public void setUser(entity.user user) {
            this.user = user;
        }
    }
}
