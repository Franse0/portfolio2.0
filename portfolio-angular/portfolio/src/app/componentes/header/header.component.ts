import { Component, ElementRef, OnInit } from '@angular/core';



@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit{

  constructor(private el:ElementRef){}

  ngOnInit(): void {

   this.addSmoothScrolling()
  }
  addSmoothScrolling() {
    const links: NodeListOf<HTMLAnchorElement> = this.el.nativeElement.querySelectorAll('a[data-scroll-to]');


    
    links.forEach((link:HTMLAnchorElement) => {
      link.addEventListener('click', (event) => {
        event.preventDefault();
        console.log(link)

        const targetId = link.getAttribute('data-scroll-to');
        console.log(targetId)
        const targetElement:any = document.querySelector(`#${targetId}`);
        console.log(targetElement)

        if (targetElement) {
          const targetHTMLElement = targetElement as HTMLElement 
          console.log(targetHTMLElement)
          window.scrollTo({
            top: targetHTMLElement.offsetTop,
            behavior: 'smooth'
          });
        }
        let nav:any = document.getElementById("nav");
      
        nav.classList.remove("show-nav")
      });
  
  
    });
  }
  // addSmothScrolling(){
  //   const links=this.el.nativeElement.querySelectorAll("a[data-scroll-to]"); 

  //   links.fofEach(link=>{
  //     link.addEvent
  //   } )
  // }

  abrirNav(){
    let nav:any = document.getElementById("nav");
    console.log(nav)


    nav.classList.toggle("show-nav")
  }
  closeNav(e:any){
    let nav:any = document.getElementById("nav");

    if(!e.target.classList.contains("nav-link"))return;
    if(e.target.classList.contains("nav-link")&nav.classList.contains("show-nav")){
        nav.classList.remove("show-nav")
        return
    }

  }
}
