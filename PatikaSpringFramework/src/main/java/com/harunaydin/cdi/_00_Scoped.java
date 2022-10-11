package com.harunaydin.cdi;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class _00_Scoped {
    /*
    Scoped = kapsam
    projenin yaşam süresini belirler
    performansı etkiler

    ApplicationScoped       Server açık olduğu müddetçe yaşar
    RequestScoped           İsteğin cevabını verince ölür
    SessionScoped           Bir kullanıcı için yaşar, logout olunca biter
    Dependent               Çağırdığımız yapıdaki scope'u alır
    ConversationScoped      Belli istek boyunca yaşar   -Ürünü sepete ekledikten sonra ödemeden sonra ölsün.



     */
}
