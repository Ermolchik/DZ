public class User {

    private final String email;

    private final String firstNameRu;
    private final String lastNameRu;
    private final String firstNameEn;
    private final String lastNameEn;
    private final String birthday;
    private final String skype;
    private final String phone;
    private final String status;
    private final int roleId;
    private final int officeId;
    private final int[] trainingGroupIds;
    private final int[] trainingIds;


    public static class Builder {

        private final String email;

        private String firstNameRu;
        private String lastNameRu;
        private String firstNameEn;
        private String lastNameEn;
        private String birthday;
        private String skype;
        private String phone;
        private String status;
        private int roleId;
        private int officeId;
        private int[] trainingGroupIds;
        private int[] trainingIds;

        public Builder(String email) {
            this.email = email;
        }

        public Builder firstNameRu(String value) {
            firstNameRu = value;
            return this;
        }

        public Builder lastNameRu(String value) {
            lastNameRu = value;
            return this;
        }

        public Builder firstNameEn(String value) {
            firstNameEn = value;
            return this;
        }

        public Builder lastNameEn(String value) {
            lastNameEn = value;
            return this;
        }

        public Builder birthday(String value) {
            birthday = value;
            return this;
        }

        public Builder skype(String value) {
            skype = value;
            return this;
        }

        public Builder phone(String value) {
            phone = value;
            return this;
        }

        public Builder status(String value) {
            status = value;
            return this;
        }

        public Builder roleId(int value) {
            roleId = value;
            return this;
        }

        public Builder officeId(int value) {
            officeId = value;
            return this;
        }

        public Builder trainingGroupIds(int[] value) {
            trainingGroupIds = value;
            return this;
        }

        public Builder trainingIds(int[] value) {
            trainingIds = value;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    public User(Builder builder) {

        email = builder.email;
        firstNameRu = builder.firstNameRu;
        lastNameRu = builder.lastNameRu;
        firstNameEn = builder.firstNameEn;
        lastNameEn = builder.lastNameEn;
        birthday = builder.birthday;
        skype = builder.skype;
        phone = builder.phone;
        status = builder.status;
        roleId = builder.roleId;
        officeId = builder.officeId;
        trainingGroupIds = builder.trainingGroupIds;
        trainingIds = builder.trainingIds;

    }

    public String getEmail() {
        return email;
    }

    public String getFirstNameRu() {
        return firstNameRu;
    }

    public String getLastNameRu() {
        return lastNameRu;
    }

    public String getFirstNameEn() {
        return firstNameEn;
    }

    public String getLastNameEn() {
        return lastNameEn;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSkype() {
        return skype;
    }

    public String getPhone() {
        return phone;
    }

    public String getStatus() {
        return status;
    }

    public int getRoleId() {
        return roleId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public int[] getTrainingGroupIds() {
        return trainingGroupIds;
    }

    public int[] getTrainingIds() {
        return trainingIds;
    }
}

class CreateUser {
    public static void main(String[] args) {
        User user = new User.Builder("belarus-91@rambler.ru").firstNameRu("Vasya").lastNameRu("Pupkin").build();

    }
}
