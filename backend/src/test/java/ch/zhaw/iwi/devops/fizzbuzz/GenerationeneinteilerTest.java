package ch.zhaw.iwi.devops.fizzbuzz;
import org.junit.Assert;
import org.junit.Test;
public class GenerationeneinteilerTest {
    @Test

	public void generationeinteilerAlpha(){
		Generationeneinteiler ac = new Generationeneinteiler();
		Assert.assertEquals("Generation Alpha", ac.generationeneinteiler(2014));
}
@Test
public void generationeinteilerGenZ(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Generation Z", ac.generationeneinteiler(2005));
}
@Test
public void generationeinteilerGenY(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Generation Y", ac.generationeneinteiler(1993));
}
@Test
public void generationeinteilerGenX(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Generation X", ac.generationeneinteiler(1975));
}
@Test
public void generationeinteilerBoomer(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Boomer", ac.generationeneinteiler(1950));
}
@Test
public void generationeinteilerSilent(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Silent", ac.generationeneinteiler(1933));
}
@Test
public void generationeinteilerX(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Generation X", ac.generationeneinteiler(1966));
}
@Test
public void generationeinteilerY(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Generation Y", ac.generationeneinteiler(1988));
}
@Test
public void generationeinteilernon(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("keine bestimmte Generation", ac.generationeneinteiler(1922));
}
@Test
public void generationeinteilerZ(){
    Generationeneinteiler ac = new Generationeneinteiler();
    Assert.assertEquals("Generation Z", ac.generationeneinteiler(2000));
}
}    
