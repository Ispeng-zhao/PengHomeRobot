package com.peng.domain.people.china;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author Zhaofengtao
 * @Date 2020/7/22 17:18
 * @Version 1.0
 *
 * 人口实体
 */
@Data
@AllArgsConstructor
public class Population {
    private String ID;
    /**
     * 国家类型
     */
    private String countryId;
    /**
     * 出生人口数量
     */
    private long birthPopulation;
    /**
     * 死亡人口
     */
    private long deadPopulation;
    /**
     * 总人口
     */
    private long totalPopulation;
    /**
     * 当前年份
     */
    private Date yearPopulation;

    public List<Population> exampleData (){
        List<Population> result = new ArrayList<>();
        Calendar instance = Calendar.getInstance();

        instance.set(1996,12,31);
        Population population = new Population("", "1", 1000000000, 1000000000, 1000000000,instance.getTime() );

        for (int i = 0; i < 10; i++) {
            instance.set(1996+i,12,31);
            population.setYearPopulation(instance.getTime());
            result.add(population);
        }

        return  result;
    }
}
