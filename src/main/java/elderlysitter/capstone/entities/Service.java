package elderlysitter.capstone.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private String url;
    private String sitter_requirement;
    private Integer duration;

    @OneToMany(mappedBy = "service")
    private List<BookingDetail> bookingDetails;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
}
