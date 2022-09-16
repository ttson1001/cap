package elderlysitter.capstone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    private LocalDate dob;

    private Boolean gender;

    private String phone;

    private String address;

    private String email;

    @Column(name = "create_date")
    private LocalDate createDate;

    private String status;

    private String code;

    private String skill;

    private String certificate;

    @JsonIgnore
    @JoinColumn(name = "admin_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CertificateCandidate> certificateCandidates;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateImg> candidateImgs;

}
