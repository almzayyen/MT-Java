package edu.virginia.psyc.pi.persistence.Questionnaire;

import edu.virginia.psyc.pi.domain.Session;
import edu.virginia.psyc.pi.persistence.ParticipantDAO;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dan
 * Date: 5/26/14
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="Demographic")
@Data
public class Demographic implements QuestionnaireData {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private ParticipantDAO participantDAO;
    private Date date;
    private String session;


    private String gender;
    private int   birthYear;
    private String race;
    private String ethnicity;
    private String residenceCountry;
    private String education;
    private String maritalStatus;
    private String employmentStatus;
    private String income;
}