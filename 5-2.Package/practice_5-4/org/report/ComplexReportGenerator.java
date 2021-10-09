package org.report;

import java.util.List;

public class ComplexReportGenerator extends AbstractReportGenerator {

    @Override
    protected boolean customerReportCondition(Customer customer) {
        if (customer.getPoint()>=100) return true;
        else return false;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        int count = customers.size();
        String format = String.format("고객의 수: %d 명 입니다\n",count);
        return format;
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        String format = String.format("%d: %s\n",customer.getPoint(),customer.getName());
        return format;
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        int sum=0;
        for (Customer customer: customers){
            sum+=customer.getPoint();
        }
        String format = String.format("점수 합계: %d", sum);
        return format;
    }
}
