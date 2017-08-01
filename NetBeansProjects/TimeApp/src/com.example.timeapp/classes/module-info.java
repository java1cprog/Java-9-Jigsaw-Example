module com.example.timeapp {
    
    requires transitive java.desktop;
    requires midnight;

    exports com.example.timeapp.spi;

    uses com.example.timeapp.spi.TimeProvider;
}
