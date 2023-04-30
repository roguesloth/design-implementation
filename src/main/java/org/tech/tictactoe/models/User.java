package org.tech.tictactoe.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;
    private String emailId;
    private String image;
}
