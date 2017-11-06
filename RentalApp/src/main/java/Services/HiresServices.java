package Services;

import Domain.Hires;

/**
 * Created by Riyaad on 11/6/2017.
 */
//hire
public interface HiresServices
{
    Hires create(Hires hired);
    Hires read(long id);
    Hires update(Hires hired);
    void delete(long id);

}
