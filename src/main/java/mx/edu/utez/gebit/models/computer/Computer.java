package mx.edu.utez.gebit.models.computer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "computer")
@NoArgsConstructor
@Setter
@Getter
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String serial;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column
    private String description;
}
