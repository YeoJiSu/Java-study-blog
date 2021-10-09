package org.report;

import java.util.List;

public class SimpleReportGenerator extends AbstractReportGenerator{


    @Override
    protected boolean customerReportCondition(Customer customer) {
        return true;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        int count = customers.size();
        String header= String.format("고객의 수: %d 명\n",count);
        return header;
    }

    @Override
    protected String getReportForCustomer(Customer customer) {

        String format = String.format("%s: %d\n",customer.getName(),customer.getPoint());
        return format;
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        return "";
    }
}
