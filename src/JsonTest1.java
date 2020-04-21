public class JsonTest1 {

    /**
     * contEndDate : 2018-02-15
     * bizNo : 1708041358198180SW01
     * comment : 备注
     * companyInfo : {"phone":"(86)4008118899","address":"北京市朝阳区建华南路6号院1号楼卓明大厦1层","zipCode":"100022","name":"昆仑健康北京分公司","serviceOrganiza":"深圳众诚泰保险经纪有限公司","url":"www.kunlunhealth.com"}
     */

    private String contEndDate;
    private String bizNo;
    private String comment;
    private CompanyInfoBean companyInfo;

    public String getContEndDate() {
        return contEndDate;
    }

    public void setContEndDate(String contEndDate) {
        this.contEndDate = contEndDate;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CompanyInfoBean getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(CompanyInfoBean companyInfo) {
        this.companyInfo = companyInfo;
    }

    public static class CompanyInfoBean {
        /**
         * phone : (86)4008118899
         * address : 北京市朝阳区建华南路6号院1号楼卓明大厦1层
         * zipCode : 100022
         * name : 昆仑健康北京分公司
         * serviceOrganiza : 深圳众诚泰保险经纪有限公司
         * url : www.kunlunhealth.com
         */

        private String phone;
        private String address;
        private String zipCode;
        private String name;
        private String serviceOrganiza;
        private String url;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getServiceOrganiza() {
            return serviceOrganiza;
        }

        public void setServiceOrganiza(String serviceOrganiza) {
            this.serviceOrganiza = serviceOrganiza;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
