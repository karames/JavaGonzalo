import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("fecha actual: " + LocalDate.now());
        System.out.println("hora actual: " + LocalTime.now());
        System.out.println("fecha y hora actual: " + LocalDateTime.now());
        System.out.println("instante actual: " + Instant.now());
        System.out.println("zona horaria: " + ZonedDateTime.now());
        // fecha y hora especifica
        System.out.println("\nmi cumpleaños: " + LocalDate.of(2000, 12, 27));
        System.out.println("mi cumpleaños 2: " + LocalDate.of(2000, Month.DECEMBER, 27));
        System.out.println("hora especifica: " + LocalTime.of(13, 17, 02));
        System.out.println("fecha y hora especifica: " + LocalDateTime.of(2000, 12, 27, 13, 17, 02));
        // probocar error
        // System.out.println("bisiesto 2023: " + LocalDate.of(2023, 02, 29));
        System.out.println("bisiesto 2024: " + LocalDate.of(2024, 02, 29));
        // partes de una fecha
        System.out.println("\ndia actual: " + LocalDate.now().getDayOfMonth());
        System.out.println("dia semana: " + LocalDate.now().getDayOfWeek());
        System.out.println("mes: " + LocalDate.now().getMonth());
        System.out.println("mes: " + LocalDate.now().getMonthValue());
        System.out.println("mes: " + LocalDate.now().getYear());
        // parte de una hora
        System.out.println("\nhora:" + LocalTime.now().getHour());
        System.out.println("minutos:" + LocalTime.now().getMinute());
        System.out.println("segundos:" + LocalTime.now().getSecond());
        System.out.println("nano:" + LocalTime.now().getNano());
        // contruir fechas apartir de otra
        System.out.println("\nfecha actual: " + LocalDate.now());
        System.out.println("fecha +10 dias: " + LocalDate.now().plusDays(10));
        System.out.println("fecha +10 semanas: " + LocalDate.now().plusWeeks(10));
        System.out.println("fecha +10 meses: " + LocalDate.now().plusMonths(10));
        System.out.println("fecha +10 años: " + LocalDate.now().plusYears(10));

        System.out.println("fecha -10 dias: " + LocalDate.now().minusDays(10));
        System.out.println("fecha -10 semanas: " + LocalDate.now().minusWeeks(10));
        System.out.println("fecha -10 meses: " + LocalDate.now().minusMonths(10));
        System.out.println("fecha -10 años: " + LocalDate.now().minusYears(10));
        // construiiir horas apartir de otras
        System.out.println("hora actual " + LocalTime.now());
        System.out.println("hora +10 " + LocalTime.now().plusHours(10));
        System.out.println("hora -10 " + LocalTime.now().plusHours(-10));
        System.out.println("\nfwcha yhora actual: " + LocalDateTime.now());
        System.out.println("\nfwcha y hora +48: " + LocalDateTime.now().plusHours(48));
        // ajustes temporales
        LocalDate fechaNacimiento = LocalDate.of(2000, 12, 27);
        System.out.println("\n tu es de: " +
                ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()) + " años");
        System.out.println("\nel primer dia del prosimo mes es: " +
                LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());
        System.out.println("ultimo dia de este mes: " +
                LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
        // tiempo q falta para llegar a fin de año
        LocalDate hoy = LocalDate.now();
        LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinAnio = hoy.until(finDeAnio);
        int meses = hastaFinAnio.getMonths();
        int dias = hastaFinAnio.getDays();
        System.out.println("fatan " + meses + " meses y " + dias + " dias hasta fin de año");

    }
}
