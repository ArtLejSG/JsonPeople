package ru.aiteko.users;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class User{
    private long id;
    private ActiveStatus status;
    public Name name;
    private BigDecimal monthlySalary;
    private LocalDateTime birthday;
    private String username;
    private String password;
    private ArrayList<String> emails;
    private String phoneNumber;
    public Location location;
    private String website;
    private String domain;
    public Job job;
    public CreditCard creditCard;
    private String uuid;
    private String objectId;

    public User(long id, ActiveStatus status, Name name, BigDecimal monthlySalary,
                 LocalDateTime birthday, String username, String password,
                 ArrayList<String> emails, String phoneNumber, Location location,
                 String website, String domain, Job job, CreditCard creditCard,
                 String uuid, String objectId) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
        this.emails = emails;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.website = website;
        this.domain = domain;
        this.job = job;
        this.creditCard = creditCard;
        this.uuid = uuid;
        this.objectId = objectId;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public ActiveStatus getStatus() {
        return status;
    }
    public void setStatus(ActiveStatus status) {
        this.status = status;
    }

    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }

    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(BigDecimal monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }
    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Job getJob() {
        return job;
    }
    public void setJob(Job job) {
        this.job = job;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getObjectId() {
        return objectId;
    }
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && status == user.status &&
                Objects.equals(name, user.name) &&
                Objects.equals(monthlySalary, user.monthlySalary) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(emails, user.emails) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(location, user.location) &&
                Objects.equals(website, user.website) &&
                Objects.equals(domain, user.domain) &&
                Objects.equals(job, user.job) &&
                Objects.equals(creditCard, user.creditCard) &&
                Objects.equals(uuid, user.uuid) &&
                Objects.equals(objectId, user.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, monthlySalary, birthday,
                username, password, emails, phoneNumber, location, website,
                domain, job, creditCard, uuid, objectId);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", status=" + status +
                ", name=" + name +
                ", monthlySalary=" + monthlySalary +
                ", birthday='" + birthday + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emails=" + emails +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location=" + location +
                ", website='" + website + '\'' +
                ", domain='" + domain + '\'' +
                ", job=" + job +
                ", creditCard=" + creditCard +
                ", uuid='" + uuid + '\'' +
                ", objectId='" + objectId + '\'' +
                '}';
    }
}
