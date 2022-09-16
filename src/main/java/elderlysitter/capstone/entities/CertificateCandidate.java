package elderlysitter.capstone.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Certificate_candidate")
public class CertificateCandidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private Boolean isRequired;
    private String exp;
    @JoinColumn(name = "candidate_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Candidate candidate;
}
