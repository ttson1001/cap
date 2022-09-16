package elderlysitter.capstone.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "candidate_img")
public class CandidateImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JoinColumn(name = "candidate_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Candidate candidate;
}
