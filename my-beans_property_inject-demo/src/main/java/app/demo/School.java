package app.demo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {

    private static final Logger LOGGER = LoggerFactory.getLogger(School.class);

    private String schoolName;

    private String programName;

    private final Student student;

    @Autowired
    public School (@Value("${school.name:JHU}") String schoolName,
                    Student student,
                   @Value("${program.name:ComputerScience}") String programName) {
        this.schoolName = schoolName;
        this.student = student;
        this.programName = programName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public String getProgramName() {
        return programName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(" ... school = ", this.schoolName)
                .append(" ... student = ", this.student)
                .append(" ... program = ", this.programName)
                .toString();
    }

    /* 
    @PostConstruct
    public void writeGitCommitInformationToLog() {
        LOGGER.info("Application was executed by using the school/program: {}", this);
    }
    */

}