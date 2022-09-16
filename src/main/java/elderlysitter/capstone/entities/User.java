package elderlysitter.capstone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Column(name = "Full_name")
    private String fullName;

    private LocalDate dob;

    private String gender;

    private String phone;

    private String address;

    private String email;

    @Column(name = "create_date")
    private LocalDate createDate;

    private String status;

    private String identity_card;

    private String skill;

    @JsonIgnore
    @JoinColumn (name = "role_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<CertificateSitter> certificateSitters;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Elder> elders;

    @OneToMany(mappedBy = "user")
    private List<UserImg> userImgs;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}
