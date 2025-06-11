package com.abhi_prep.practice.FactoryPttern;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plan Type & units: ");
        String plan = sc.next();

        GetPlanFactory factory = new GetPlanFactory();
        Plan p = factory.getPlan(plan);

        int units = sc.nextInt();

        p.getRate();
        p.calculateBill(units);
    }
}

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(rate * units);
    }
}

class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.5;
    }
}

class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 6.2;
    }
}

class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("DomesticPlan")) {
            return new DomesticPlan();
        }
        return null;
    }
}
