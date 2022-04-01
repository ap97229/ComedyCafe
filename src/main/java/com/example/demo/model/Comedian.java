package com.example.demo.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "COMEDIANS")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class Comedian implements Serializable {

  @NonNull
  public @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

  public String name;

  public Long popularity;
}
