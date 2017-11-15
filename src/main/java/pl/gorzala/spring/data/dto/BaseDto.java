package pl.gorzala.spring.data.dto;

import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
public class BaseDto implements Serializable {

  @Transient
  private static final long serialVersionUID = 1L;

  @Id
  @Column(updatable = false, nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public BaseDto() {

  }

  public BaseDto(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
