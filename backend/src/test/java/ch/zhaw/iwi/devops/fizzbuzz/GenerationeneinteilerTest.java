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
}    
