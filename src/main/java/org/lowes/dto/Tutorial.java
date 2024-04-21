package org.lowes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Tutorial {

  private String title;

  private String description;

  private boolean published;
}
