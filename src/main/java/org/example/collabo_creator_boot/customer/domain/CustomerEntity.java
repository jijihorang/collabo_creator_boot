package org.example.collabo_creator_boot.customer.domain;

import jakarta.persistence.*;
import org.example.collabo_creator_boot.common.BasicEntity;

@Entity
@Table(name = "customer")
public class CustomerEntity extends BasicEntity {

    @Id
    @Column(name="customer_id", nullable = false)
    private String customerId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "customer_phone", nullable = false)
    private String status;

    @Column(name = "customer_zipcode", nullable = false)
    private String customerZipcode;

    @Column(name = "customer_addr", nullable = false)
    private String customerAddr;

    @Column(name = "customer_addr_detail", nullable = false)
    private String customerAddrDetail;

    @Column(name = "customer_profile_image", nullable = false)
    private String customerProfileImage;
}