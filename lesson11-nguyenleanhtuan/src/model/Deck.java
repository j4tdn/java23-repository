package model;

import bean.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> boBai;

    public Deck() {
        boBai = new ArrayList<>();
        String[] loaiBai = {"Cơ", "Rô", "Chuồn", "Bích"};
        String[] thuTuBai = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String loai : loaiBai) {
            for (String thuTu : thuTuBai) {
                boBai.add(new Card(loai, thuTu));
            }
        }
    }

    // Xào bài
    public void shuffle() {
        Collections.shuffle(boBai);
    }

    // Chia bài cho n người chơi
    public List<List<Card>> chiaBai(int soNguoiChoi) {
        List<List<Card>> danhSachNguoiChoi = new ArrayList<>();
        
        // Tạo danh sách cho mỗi người chơi
        for (int i = 0; i < soNguoiChoi; i++) {
            danhSachNguoiChoi.add(new ArrayList<>());
        }

        // Chia bài cho từng người
        for (int i = 0; i < boBai.size(); i++) {
            danhSachNguoiChoi.get(i % soNguoiChoi).add(boBai.get(i));
        }

        return danhSachNguoiChoi;
    }

    public List<Card> getBoBai() {
        return boBai;
    }
}
