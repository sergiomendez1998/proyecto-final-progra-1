package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Section {
    private int idSection;
    private String name;
    private Double price;
    private String side;
}
