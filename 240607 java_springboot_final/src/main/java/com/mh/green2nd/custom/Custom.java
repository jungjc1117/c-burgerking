package com.mh.green2nd.custom;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mh.green2nd.custom.customMenu.CustomMenu;
import com.mh.green2nd.user.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "custom")
@Tag(name = "custom", description = "즐겨찾기 = 커스텀 = 나만의메뉴")
public class Custom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custom")
    @JsonManagedReference
    private List<CustomMenu> customMenus = new ArrayList<>();

    public List<CustomMenu> getCustomMenusList() {
        return this.customMenus;
    }



}
