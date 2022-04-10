package ch.zhaw.iwi.devops.fizzbuzz;
import org.junit.Assert;
import org.junit.Test;
public class GenerationeneinteilerTest {
    @Test

	public void generationeinteilerAlpha(){
		Generationeneinteiler ac = new Generationeneinteiler();
		Assert.assertEquals("Generation Alpha", ac.generationeneinteiler(2014));
}

}    
