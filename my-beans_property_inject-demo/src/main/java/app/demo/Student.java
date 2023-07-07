package app.demo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private final String studSSN;

    private final String studEmail;

    private final String studName;

    @Autowired
    public Student(@Value("${parm.stud.SSN:123-45-6789}") String studSSN,
                   @Value("${parm.stud.Email:email.com}") String studEmail,
                   @Value("${parm.stud.Name:LeonidFelikson}") String studName) {
        this.studSSN = studSSN;
        this.studEmail = studEmail;
        this.studName = studName;
    }

    public String getStudSSN() {
        return studSSN;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public String getStudName() {
        return studName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(" ... studSSN = ", this.studSSN)
                .append(" ... studEmail = ", this.studEmail)
                .append(" ... studName = ", this.studName)
                .toString();
    }
}
