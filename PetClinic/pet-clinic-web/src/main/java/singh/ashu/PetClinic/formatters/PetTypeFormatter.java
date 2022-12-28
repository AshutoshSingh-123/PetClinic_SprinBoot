package singh.ashu.PetClinic.formatters;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import singh.ashu.PetClinic.models.PetType;
import singh.ashu.PetClinic.services.SDJService.PetTypeSDJService;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeSDJService petTypeSDJService;

    public PetTypeFormatter(PetTypeSDJService petTypeSDJService) {
        this.petTypeSDJService = petTypeSDJService;
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        List<PetType> findPetTpye= petTypeSDJService.findAll();
        for (PetType type:findPetTpye) {
            if(type.getName().equals(text)){
                return type;
            }


        }
//
//        throw new ParseException("Not found"+text,0);
        return new PetType(text);
    }

    @Override
    public String print(PetType object, Locale locale) {
        return object.getName();
    }
}
