package web.springwithweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.springwithweb.model.Person;
import web.springwithweb.service.PersonService;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    @ResponseBody
    public String homePage() {
        return """
                 <html>
                 <head><title>Página Inicial</title></head>
                 <body>
                 <h1>Sistema de Gestão de Vacinas</h1>
                 <p>Bem-vindo! O servidor está rodando perfeitamente.</p>
                 <h3>Menu Rápido</h3>
                 <ul>
                 <li><a href='/people/new'>Cadastrar Novo Paciente</a></li>
                 <li><a href='/people/total'>Ver Resumo de
                Cadastros</a></li>
                 </ul>
                 </body>
                 </html>
                 """;
    }

    @GetMapping("/people/total")
    @ResponseBody
    public String totalPeople() {
        long total = personService.countTotalPeople();

        return "<h1>System Overview</h1>" +
                "<p>Currently, we have <strong>" + total + "</strong> people registered for vaccination.</p>" +
                "<a href='/'>Return to home.</a>";
    }

    @GetMapping("/people/new")
    @ResponseBody
    public String exibirFormulario() {
        return """
                 <html>
                 <head><title>Novo Cadastro</title></head>
                 <body>
                 <h1>Cadastro de Paciente</h1>
                 <form action='/people/new' method='POST'>
                 <label>Nome Completo:</label><br>
                 <input type='text' name='nome' required><br><br>
                 <label>CPF:</label><br>
                 <input type='text' name='cpf' required><br><br>
                 <label>Data de Nascimento:</label><br>
                 <input type='date' name='dataNascimento' required><br><br>
                 <label>Grupo Prioritário (Radio):</label><br>
                 <input type='radio' name='grupoPrioritario' value='Idoso'
                required> Idoso
                 <input type='radio' name='grupoPrioritario'
                value='Profissional de Saúde'> Profissional de Saúde
                 <input type='radio' name='grupoPrioritario' value='Nenhuma'
                checked> Nenhuma<br><br>
                 <label>Alergias (Checkbox único):</label><br>
                 <input type='checkbox' name='possuiAlergia' value='true'>
                Possui alergia grave a medicamentos<br><br>
                 <label>Comorbidades (Checkbox múltiplo):</label><br>
                 <input type='checkbox' name='comorbidades' value='Diabetes'>
                Diabetes
                 <input type='checkbox' name='comorbidades'
                value='Hipertensão'> Hipertensão
                 <input type='checkbox' name='comorbidades' value='Asma'>
                Asma
                 <input type='checkbox' name='comorbidades'
                value='Obesidade'> Obesidade<br><br>
                 <label>Tipo Sanguíneo (Select):</label><br>
                 <select name='tipoSanguineo'>
                 <option value='A+'>A+</option>
                 <option value='A-'>A-</option>
                 <option value='B+'>B+</option>
                 <option value='B-'>B-</option>
                 <option value='AB+'>AB+</option>
                 <option value='AB-'>AB-</option>
                 <option value='O+'>O+</option>
                 <option value='O-'>O-</option>
                 </select><br><br>
                 <button type='submit'>Salvar Paciente</button>
                 </form>
                 <br>
                 <a href='/'>Voltar</a>
                 </body>
                 </html>
                 """;
    }

    @PostMapping("/people/new")
    public String saveNewPerson(Person person) {
        // No protocolo HTTP, se um checkbox não for marcado,
        // o navegador simplesmente não envia a variável para o servidor.
        if (person.getHasAllergy() == null) {
            person.setHasAllergy(false);
        }
        // Apenas para ficar como as comorbidades das outras pessoas, ", "
        if (person.getComorbidities() != null) {
            person.setComorbidities(person.getComorbidities().replace(",", ", "));
        } else {
            person.setComorbidities("Any");
        }

        person = personService.save(person);
        System.out.println("Success! Pacient saved on DB: " + person);

        return "redirect:/people/total";
    }
}
