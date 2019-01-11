package com.blueberry.webapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HEK(hk177955)
 * @date 2018-12-17 17:11
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Dog {
    private int age;
    private String nickName;

}
