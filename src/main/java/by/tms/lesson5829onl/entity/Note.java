package by.tms.lesson5829onl.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Author simonpirko
 * Created on 29.10.24
 */

@Getter
@Setter
@ToString
@Entity
@Table(name = "tms_tb_note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
}
