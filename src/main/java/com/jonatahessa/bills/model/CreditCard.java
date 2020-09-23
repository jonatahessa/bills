package com.jonatahessa.bills.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CreditCard implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Date dueDate;
    private Date closeDate;
    private BigDecimal limit;
}