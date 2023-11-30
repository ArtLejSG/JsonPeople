package ru.aiteko.users;

import java.util.Objects;

public class Job implements Comparable<Job>{
    private String title;
    private String descriptor;
    private String area;
    private String type;
    private String company;

    public Job(String title, String descriptor,
               String area, String type, String company) {
        this.title = title;
        this.descriptor = descriptor;
        this.area = area;
        this.type = type;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptor() {
        return descriptor;
    }
    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(title, job.title) &&
                Objects.equals(descriptor, job.descriptor) &&
                Objects.equals(area, job.area) &&
                Objects.equals(type, job.type) &&
                Objects.equals(company, job.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, descriptor, area, type, company);
    }

    @Override
    public int compareTo(Job sort) {
        return title.compareTo(sort.getTitle());
    } //для сортировки
}
/* import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Job implements Comparable<Job> {
    private String title;
    private String descriptor;
    private String area;
    private String type;
    private String company;

    @Override
    public int compareTo(Job other) {
        return this.title.compareTo(other.title);
    }
}
*/