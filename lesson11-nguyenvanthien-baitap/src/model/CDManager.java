package model;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.CD;

public class CDManager {
    private List<CD> cdList;

    public CDManager() {
        cdList = new ArrayList<>();
    }

    // thêm cd neeys kh trùng
    public boolean addCD(CD cd) {
        for (CD existingCD : cdList) {
            if (existingCD.getId() == cd.getId()) {
                return false; // trùng
            }
        }
        cdList.add(cd);
        return true;
    }

    // tổng cd
    public int getCDCount() {
        return cdList.size();
    }

    // tổng giá cd
    public double getTotalPrice() {
        return cdList.stream().mapToDouble(CD::getPrice).sum();
    }

    // cd giảm dần
    public void sortByPriceDesc() {
        cdList.sort(Comparator.comparingDouble(CD::getPrice).reversed());
    }

    // cd tăng dần
    public void sortByIDAsc() {
        cdList.sort(Comparator.comparingInt(CD::getId));
    }

    // list CD
    public List<CD> getCDList() {
        return cdList;
    }
}
