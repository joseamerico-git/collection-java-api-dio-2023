package list;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlutra(), p2.getAlutra());
    }

}
