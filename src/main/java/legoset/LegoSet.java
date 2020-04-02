package legoset;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "tags", "minifigs", "weight", "url"})
@Data
public class LegoSet {

    private String name;
    private String theme;
    private String subtheme;
    private String url;

    @XmlAttribute
    private String number;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElement(name = "tag")
    @XmlElementWrapper(name = "tags")
    private Set<String> tags;

    @XmlElement(name = "minifig")
    @XmlElementWrapper(name = "minifigs")
    private List<Minifig> minifigs;

    private Weight weight;

}
