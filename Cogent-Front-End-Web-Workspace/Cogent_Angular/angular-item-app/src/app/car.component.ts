import { Component } from "@angular/core";

@Component({
    selector: 'car',
    templateUrl: './car.component.html',
    styles: ['div {margin-bottom: 15px; font-size: 25px; display: inline-block; margin: auto;}', 'img {display: inline-block}']
})

export class CarComponent {
    itemNo: number = 1003;
    itemName: string = "car";
    itemPrice: number = 32000;
    imageUrl: string = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxIQEBUQEhIVFRUVEBAQDxUVFRUVFRUVFRUWFhUVFRUYHSggGBolGxUVITEhJSorLi4uFx8zODMuNygtLi0BCgoKDg0OFxAQGi0lHx8tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLSstLS0tLf/AABEIAJ4BPgMBIgACEQEDEQH/xAAbAAABBQEBAAAAAAAAAAAAAAACAQMEBQYAB//EAEIQAAEEAAMECAMECAQHAQAAAAEAAgMRBBIhBTFBUQYTMmFxgZGhIrHRQlJywRQjYpKi4fDxBxWCkzNDU2ODwtIW/8QAGgEAAgMBAQAAAAAAAAAAAAAAAAECAwQFBv/EADkRAAEDAQQHBgUDAwUAAAAAAAEAAhEDBBIhMQVBUWFxkaETgbHR4fAUIjJCwRVS8UNyoiMzYpKy/9oADAMBAAIRAxEAPwDJgogU2Hog9eeXrpTgKIIOs7koekVKQnQlCbzIg5KCnIRo2lAHI8yipSE4LRhNB6UOSKchPgIgmmvKMOKjClKkMRtUYOKdBKjCd5PBKEyCiaVGE7yfStQNKcCUJyjCO00lCUIvJ5pXApoIglCLydtECm1ySLyeBS5k1aUJQiU5mXZkKVEJSUWZECgXWiESjtdaEFKhEpbSFcuTSXBGhXWhCK0iRKkmlXJFyELzsFEEKUFdNYk4CiCbCcCipIwUSbBToSTRAogU0E4ColNGEbUARhRUgUYTrUFJWpFMJ1EEIShQUkYRNQhOBCaII2psIwoJpxEE2EYQmjCUJAlCSEQRIQiSKEoSpAlSQiSoAlQnCNcuS0khJSVKuQiFyVDSWkIhdaVIupCIXLrSpEkQltdaS0loTheehKFyILprAiCUIQEYCipBGiahaiCSaUJxqAJxqiVJE1ONQNToUU0TUQCRE1IqQRhKEgRBQUkQCcCazVqVX4rb8EembMeTdffcm1rnGGiUnPa0S4wrcI2rKzdLPusrx1/NRT0nf3n0HyVwsdU6lT8ZQ/ctujawncD6LDjpVJwBHhkH/qkd0okPGT/c+gR8FWOpP42z/u6FbwRO+6fQoupd913oV58ekbjva4/+T+SD/PQTqxxJ07V+1I+Bre/5S+Ns/wC/ofJegGVo0Lh6j5I2yA7tfVZuCZkcYlnd1TTuaazE8gG3fl7KLN03a3SHD5uTpHV55W38wqm2ao8/IJ36uavq2ihRHzug7NfLMLZNcio8ivPD0/xfAQt8GO/NxXN6fY370f8Atj6qwaOtGwc/RZDpSgMpXoZB5JQV55L/AIhY1un6nUXYYfSi7Qqbs/8AxHeSBPG13eygf3XXfqFF2j7Q0TdB4H+E2aRouMTHFbe1wKgbO6QYbEdh7bP2XfA704+StRl5e5WN8tMEELeMRIxTSVPiJp4lNua26D7PKvokHAoBTa5SGYN53AHzA+aCaBzO00j5eqJSDgTAKaXWhtdaakltJaVIhNciQ2ltCFgAuCEFEF01zkYRtTYRhRKaMIghCIJKSIJwJoJwJFNOApxpUe040qCkE81EEFqBjNuxxaVndwF/Df7RG/wCk1jnGGiSk57WCXGArTOALJAHMqnx/SNjNIxnPPc3+az20dqyTH4nacGjRo8AoGZbqVhAxfyXNraR1UuZ8vPkp+N2lLMfjca5DQDyURBa7Mt7WhogCAua6oXGXGSnEloMyEuThRvJ0nS++h+aHMhhYXuDRVk0LIA8yUT8OQctgk6NA4+HcndwUbycmxBkNBoLjQFbyVcxBmDaJJfilIqNvIc/DfrvO7nQ4eFuEZ1jqdI7RjfvHkP2RpZ46dyq8bhpHOzvtzifj5DkB/LkqP8AfP8Ax8fTxW2RY4P9T/x5uPfG/CWcZjXTPL3kknQcgBuAHAIGSUrHZWCjsmQjTczWz41w+qtpMVEwbmt8gK9UPtAYbrWz0RQsL6zO1c+AduJPHEdSsvHAXGhqTuCt8HsjjJpxrd6v/JWeClOIa7q4s+XRpqrdpp4CwTeiuNm9G3kfrXBo0OQfF/DeUergeITNqp0xNXA7MzyGPgqjYqj3RR+YbQIHM4ciVlcXsszljIYzqH9Xp26cASD93XtHT5K1b0Rdh2ggiR2UdbW9p4ho4t7957ltocMyIHINXVncdXOrdZ5DgBQG4AKPjJWsaXvIa1otzjwXLr6RdUdDBA6n3sHou3YtFtpC/UOI5D3tPRYiTZJ35HN0JJosFDUkk6UouzNvYiOQR4dxkb92X4m13He0eYTu2Nry4+TqIvhi+0TVuAN5n93Jvme682NhocM2m6u+27iSrnm5TiqJcftzjed/DJJgNoqf6JusB+rWdzfMrQwSyyNBfTBQzNabJPHUgaKUzENYKGnz81SnaPgoGNx41LjTWjNIRvrkO8rmimXGIXWcWtEk4LXQ7XY3ifJX2Cx8U8RaNSe0DwHCuF38l43PtCNzbms6AthB+FjSQAXD7TtRv0HdxndG9rNwmKacM5xhkeyHEw2cpzEAOaHHRzXagnlvykhbf0o3SZF73r99689X0lSe+GNMbZjpH5GpbrERZHlp4H+YTVp/aFiV17719Aoq5QxAXcbkEdrrQ2lTUkVpUNpcyE4WABSgpoFKHLqLlSngjCZBTgSKlKcBRhMogopynQUYQNFmhryV1hsKIhZ1f7N8O/vVb3hoV1Kk6oYChNwhq3achx/kn8LgbsudpwA+qfcbTZlI3FZ77iug2hTbqlYzazcax7muDy26GQW2uFZdfVUj2PG9rh4tIXoksijPlPMrpUraWiLo7sFyK+imvM9oe/H8hYHrDy9iuEvcty6Q8yo+dzzTTpxK0C2k/b19FldokD+p/j6rJtY87mOPg1x/JPNwcx3RHzofMrWiFc4AKHxx1AKY0OzW49PVZduypjwaPFw/K063Yb+L2jwBPzpXrnoXO4n+vol8XUOxWDR1nbmCe/yhVUexGjfI7yAHztTsFhIYjmDS51VbiT7ikRe2rJ3cP63qqxO0HONMG7S+H81IdrVwkqLvhbNDroB1az3K+mZBK4PdDTgACRI7cNBQdYHpxJ4qu2pg43io5pWm+y5rHN0/aaWk/uqDE/ED4gQee8e4Onmtv0Q21EWOYIwyRusgPaPEWePcf6JVNWg0ETA34flU0RZbU8iMTjrBOs6159hNh4iSTI2N3Muo5QOZct5sbo5BAGkxse8DVz2hw59l1hX+LxZyhvGgDx81TTYwN7RA9z6BY6trq1xdGA3a10rNo6hZ/meJJ26uCtgWNstaxtmyGNawejRSF2KA1vQbzwHieCzsu1CeyPN3/wAhRJHOfq4k8r3DwG4KhtnnNajXa0Q0YBX+I200dn4vDd6/3WQ6Z7QfIxlmgH6NHZOhskcTuHrzN2McVqp6UkZAziDnPcOS6FlpMY8EBcu31H1KLhqVBg8a6N4dZI3OHMcaWwidmaHtNgiwVhvJXfRvaJY/qndl3Z7j9Ctlpo3heGYXMsFqNN3ZnI+Pr4q/6wqBtZ9hjPvOdI7wj3A+Z9lbtgLyA1pJO4AfVVfSKHqp+rJFjDMB5Bzi8nXyCyWZo7UbsV0rfVc2znVMDmceioMWx9Oe4EW9rRf+o6D/AEhP4SURSNdZLgGfDVAOAFZjeoBAOngmoMM/K5zroAODjZbmA0IO46OvimI48vx2DrpvNu3i/Qn+66q82TC9uxk4leZQSRI2OVvCs8bTQHD+6ZR7Ew2bDRH/ALTPkrAYNeUqN+d0bT4r2lFzRTaJ1DwVYuoq1GDRtwShdKn2zQqfKUuQq6GCRDBJ3Cka7V5AEQXBqJrV0SVz4RNRhIGog1KVKEQRsCENTuK2XJLAzJ2ZMR+jzuB+KNmTPdVucA8X+xX2imxt8xMDM8Bmo1XFjZAk5AbzgFO2G3MOv4GxD+1Whk8OA7teIqdI7micQ0BrQAAA1oG4AaADuUKaalhe7tHTy4LsUqYpMu5nWdp95bk5JIoM2I5JibEEpklWtp7UnP2JwyIcybtdI9rRbiAOJJoeqtAVROtG2Mv7m8Tz8FJzBooKjxfSJjRTGl3f2W+p3qlxO2pZN7so5N09960MslV+eA3+5WCrpKz0sjeO7zy6rV4jGtboXUeQ1PoNVFnxEvVtlZh5HMfIYo3kFrXSCvgAFku13aXrW4rO4COSaQRRMLnyZWNaG25zr4cVso8Q7Bw/ocUxe9r3Omka4dXC8tyPjwzhvfVtdNwstZVucdbbJSpiXYrmu0laKzrlMAT3nrh0Vbi8NI2myS08OPWxxAUyvsOk1uS99aNognNYHEEgDQAbrP11J703nDdBwGnIeA4Jj9IvUG+Zbu83blUZeflGGwLY0imJqOk6yT4bAgx79Mt795HLj9PVU2ImLhTdADWnh/dTMS4vutSSGDwG/d3ph+HAiJsEh7QWtIdVjS637jutbaTLrQFxLVV7WoTqyHBMxzSNcHsLgdLI5jQ3w7/NXeExw6yOYEB7HNEuXRpa4/EB3ceWh7lnprAAvfqfFStnEAlp+20jw/qvmrHC8CDrVLHljg4ZjHktviNuSTfCPgq9BWo8QBqNf6CiCO1XwuNA7jQPmrfCvzi+I7Q/Mdy4z23RgvV033s10USfLE/h8O524WrEbGzDV+XwAJ91SarWnEq/siQqlzwxt6X9kWBZWbxcDnuJcRZJtbr/ACLDt1kc534nVfpqVIjwmHaLZC3T7RHyJsqTbT+wE9PFUvoCIeQF5WdkuJphvkKN+y0fRrorI13WS037ut1zPitFtHbMER/WPaXbsraNeQVDjelYeCyFrnPOjfh/IGytodXqtuxgVziyx2d1+cRl/Ga1LJ2QghlD7zz9Tv8AksN0nxMLpWujkMjiCJnXY0rLVADi/cou0MBjCzr8QyXJe9zXUP8ASOyO80qV8oO78h7BWWagGm8HTwyWW2211UXLkbzMqdh5qdG14zM6x4cy6tr8rXAHgd5B56pMLh/1nVnW7APA6HK4VvuuHNLhWtkIt4YQ0tDnXl4kXlBI3nWt9LW9Auj5fI2Z4uON2ZrqIDnfdZe9t0Se6uJWmrUbTYXuyC51Km6o8Mbmfc9y9O2bAI4Y4/uxsafEAA+6lilGDkfWLzF8kyV6kMgQFIDh3Ig5R2vCTrBwRKiWKXmSgqJ1gSiVO8o9mvJGxJ1sJVg2BOiJWGstYoqubh08zDJyfFRM7UkbfFwv0USXpDhm/aLvwtPzNBMCo/6Wk9yTjTZ9RA71LGGSvxv6KDI7P1bwI5cmtHMDG9zeIBsc/i4qnl6XNHYiJ/E4D2AKgy9IZpgQ5rGx5oxJobILx8Nk8aPutNCzVrwvDDIydRwKzV7VRDTcPzDEYTiMRnh771pW7Qjfq14Nan7JHiDRCr5ZgSTm51roB+G/Ly8U9P0fgD/gjkZehcyQ8eBDyVk5NitG8yDU72jh5Lb+nNYTDs9wKwfrL3xeYJGwkdIPnvWiMzRvc394JibaMLRZlb4Cnn0CzeM2VkYXhxNVoRXEBVtJiwt1kpO0y/UwDvPor/E9ILNMbQ+8avybuHnaaZgxM0SSY2BhN015xDnjyjhcB5KmARWtbKbKf0hc6taatb63Tu1csvzvV7/lmEAuTHOceUWFlk95XRomR7OaNX4x57mYeAe8kizhSgqaoW46O4rDO62DDZ8LPNEYoMRNMyTeRcWZsTOpzi25td9WNxr5Q9hdDIwxvjOSSM6FpHzHIrNRuvQ+S0Ue2BiGtixTqkjblw2JILiGjdDiANXx8naub3jRV1GXwtNnr9k6dRzXFBFG0bmgeApLA/M0OqrH9eKNqwmRIXaaQ6HKrkY5wLWgu7ZIG/tcuOtJjBsol5AysLc4ddamsunHQ+iKcfE5v7TgPWwnp8Y90eV7i74yRZv7I0s8N66IyXnnD5jxUWd4B3DeT/XBPbPbmmYeGYX3UNR6JJMrmM1AeARruc0E1w0I3WfVScMDBG9zgQSBkvcbBAcOYomiO9NRVpGp+Cc5jg4NujuO4jke5Z3CbbMbKqzrqSdBwArX3CZxG2pX/aIHJvwe4191g+GeSQcl2zpCiBIknct3jemUMfwtFkacgDy71SYrprK7sih3aD13rKNxBALRQDqBoamjdXvGtaDkOSmYTYeKmNsgee8jKP3nUExYrPSxd1KqdpO1VjDegnwUybpLOdzw38IzO/eP1VdPtF7+097/AMTjXoFoML0AndrJLGzuFvPnuHurfB9AoG11sj3niG0xv5n3QbXZaeR5D85dUhY7dV+qRxMdAZ6LACYjWgO6hXne9aDZ+2doPAZhhQ3fqYGN9XBunqt7g9g4SGsmHZY3Fwzn1datmycB5LJW0ix2FyeMeGPitlDRVRmdQj+2R1w8F55H0Z2piP8AjTOaDvEkznacfhaSPLRWeB/w4iGs073dzAGDws5r9lss64PWY26tENho3CFsboygMXS47zPp0VfgOimCh1bh2ON75LkP8VgeSvxu08lGbIMu/juS9YeazOcXGXGeKvbRa0QwAKQJKS9aoz9EBlUMlO4CpokXdYoHWlEZEkdmp4lHNIZlAEi7OnKOyXks238Q77Yb+FoHubKr5sXI/tPe7xcSPRAgpekbTY36WgLzrqlR2biUgXWuISUpqtdmUnHSNdHHGwgANDpLvWQjW/BRCE1LakGyQdire8hpG1X0G2sW0AicO7ntaf4gD7kJiTaE9klsZskkNcD38HlUVkLs55q9YZIVtitoPcwtdERYq9dPZJsacNdkeNHdlxHZdyPcf64qqznmhtQcwOBCnTqupvDxqWnx2zw/UfC7w0PcQqDEQuYac2vkfBT8NtpzQA5ofWgJJBrhfNSf/wBMeETR5n6LM0VmYRI4ro1jZK3zXi0/2k9MlRA2i6t33T6FXR6Tv/6bfUps9JZfut/i+qsv1f2f5eio7Ky66p/6HzVfBA4u7J57qVrh9nC8zviPIagePP5KK/b0x+6PAfVRZNpSu3vPshwquEYBNjrLTM4u4gAeJWiLedDzTb54273j2/NZl0rjvJPmUUULnmmtLjyAJPsoCy7SrXaRJPys6+Sl4+VpkLmHQgX47vyCCg4b6Oa6O4jTjw3bu8qbhujWKf8A8vKObyB7b/ZXGC6Gn/mTVzDG2P3nfRDrTRpiC78+CpFitNZxcGRO3AdVnJMOCdTQA33d+GmnHmnTh5cRTYo3OaNAQDV97t3qVvMBsHDw65M5+9JTiPDSh5BW2laegWSppIfY2ePl6rfS0MSJqOjcMep8lg8J0KmdrI9jByFvPoKHurvB9DcM3tl8nicrfRuvutAkBWN9truzdHDD16ro09HWZn2Txx9OiHBYCGH/AIcTG94aL9d6mdYmQUvkFlMnErc2GiAE9ntLmTGZJmShOVJD0YlUPOlDkQiVLEqRz1GLl2dEJypweMuiWJ9neogdojgk1RCSn4/QiuSiZ07jn6DwUPrEObikz6QpAcUmZR8yXOowpSn+sS9cFHMgSCRKESvJqSZU5SWl6SV5eE1lXZU7S6kSlCayJqSNTKQvbogOSLcFCMSAwhSsq7KrL6rNJuxQ+oXdQpeRSYdnSv7MbvGqHqUGpGZSbZw4wByVX1CX9HWjh6PSHtOa3+I+2nup0PR6Idpz3ejR9fdUutlNuvktDNGPd9scfcrHfo6kYfZr5OwxzvAGvXct3h9nxM7MbfEiz6lSc3MrM7SJ+0c1rZohv3Hl6+Sx0PRSY9rKz8TrPo21Yw9EYx25Se5oDfc2tDmC7Ms77bWdrjgtVPR1mZ9s8VCw+wsOzdED3vt3sdPZWUYDRQAA5CgE2Hd67MsznOd9RlbGMawQwAcMPBPZkoco+ZHG75JKcp3ME5HIoZciY5JCll+q4vUeRyHN3poUvrFxeoudKHoQpAeuzqPmXBwQhSBIlD1Gzrs3elCFK6xKZlEzJcyIQpQkTkT1Czo2PRCFPnxFqMXWmZHprMiEKWUmdRsy7N3pQiVK6wIjIFDtdaIRK8+S0lpOQQF5oV5rurzcSmqShXEew67b/wB0fmVMg2bEBeW/xG/bcqHWlg3rU2x1XCch72LPMF6AX4KRHs2V25hHjp81pG0wfCAPAAJS5UutR1BaGaPb9zuSpItgn7TwPAE/RS4tjQt35neJoegpTyktVOr1Dr5LQ2y0W/bPHFJFh2M7LWjwH5o7XWktUnHEq8YZIrXZkFpQiE5RZkQKBdaUIlHmXAlBaXMiESnA5JmKbtLaIRKdXNTVowiESlJStJTeZcCiESn3FCB3oLXWiESjXJsvSZkQiU5aW03mSWiEpTlrrQWuzIhEpzzXJvMlzIhEpwJ1jlGzImlCJTrygQuKHMhEpy11pvMuzIhEpzMltN2kzIhC/9k=";

    toDisplay = true;

    delete() {
        this.toDisplay = !this.toDisplay;
    }

    toUpdate = false;

    update() {
        this.toUpdate = !this.toUpdate;
    }
}
