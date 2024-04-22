package com.restProject.objs;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Order {
    public String name;
    public int numberOrder;
    public int price;
}
