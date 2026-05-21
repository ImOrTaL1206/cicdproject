@GetMapping("/")
public String home() {
    return "CI/CD Project Running Successfully";
}

@GetMapping("/health")
public String health() {
    return "OK";
}