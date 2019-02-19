package com.springys.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yzd on 2019/2/2.
 */
@Data
@Component
public class RuseltData {
    List<Aj> dos = new ArrayList<>();
    List<Aj> dm = new ArrayList<>();
    List<Aj> dw = new ArrayList<>();
}
