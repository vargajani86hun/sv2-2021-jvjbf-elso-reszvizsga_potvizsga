package teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TeaHouse {
    private String name;
    private List<Tea> teas = new ArrayList<>();
    private LocalTime openTime, closeTime;

    public TeaHouse(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        teas.add(new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        teas.add(new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
    }

    public void addTea(Tea tea) {
        teas.add(tea);
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Tea actual : teas) {
            if (actual.getSort() == sort) {
                actual.setPrice((int) (actual.getPrice() - (actual.getPrice() * percent / 100.)));
            }
        }
    }

    public double getAveragePrice() {
        int sum = 0;
        for (Tea actual : teas) {
            sum += actual.getPrice();
        }
        return sum / (double) teas.size();
    }

    public String getName() {
        return name;
    }

    public List<Tea> getTeas() {
        return new ArrayList<>(teas);
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }
}
