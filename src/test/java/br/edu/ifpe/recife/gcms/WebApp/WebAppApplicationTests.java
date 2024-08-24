package br.edu.ifpe.recife.gcms.WebApp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
			
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content()
			.string(containsString("Hello, World java")));
	
	}
	@Test
	public void checkingUpdatedMenssage() throws Exception {
		this.mockMvc.perform(get("/Diogo"))
			
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content()
			.string(containsString("Hello, Diogo")));
	
	}
	
	public void checkingUpdatedMenssage2() throws Exception {
		this.mockMvc.perform(get("/Professor"))
			
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content()
			.string(containsString("Hello, professor Ramide! Ajuste Passo 2 Parte 3.")));
	}
	
	public void checkingUpdatedMenssage3() throws Exception {
		this.mockMvc.perform(get("/Hotfix"))
			
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content()
			.string(containsString("Hello, pratica 04")));
	}
	
	public void checkingUpdatedMenssage4() throws Exception {
		this.mockMvc.perform(get("/build0122"))
			
			.andDo(print()).andExpect(status().isOk())
			.andExpect(content()
			.string(containsString("Hello, pratica 05")));
	}
}